from typing import List


def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        ml , mr = 0 , len(matrix) - 1
        nl , nr = 0 , len(matrix[0]) - 1
        while ml <= mr:
            m_mid = ml + (mr - ml)//2
            if target < matrix[ml][0] or target > matrix[mr][nr]:
                return False
            elif target > matrix[m_mid][nr]:
                ml = m_mid + 1
            elif target < matrix[m_mid][0]:
                mr = m_mid - 1
            else:
                while nl <= nr:
                    n_mid = nl + (nr - nl)//2
                    if target > matrix[m_mid][n_mid]:
                        nl = n_mid + 1
                    elif target < matrix[m_mid][n_mid]:
                        nr = n_mid - 1
                    else:
                        return True

        return False


    # def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
    #     ROWS, COLS = len(matrix), len(matrix[0])
    #
    #     l, r = 0, ROWS * COLS - 1
    #     while l <= r:
    #         m = l + (r - l) // 2
    #         row, col = m // COLS, m % COLS
    #         if target > matrix[row][col]:
    #             l = m + 1
    #         elif target < matrix[row][col]:
    #             r = m - 1
    #         else:
    #             return True
    #     return False
