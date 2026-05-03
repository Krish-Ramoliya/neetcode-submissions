class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        rows = [set() for _ in range(9)]
        cols = [set() for _ in range(9)]
        boxes= {}

        for i in range(9):
            for j in range(9):
                val = board[i][j]

                if val=='.':
                    continue
                
                # check row
                if val in rows[i]:
                    return False
                rows[i].add(val)


                # check col
                if val in cols[j]:
                    return False
                cols[j].add(val)

                # check boxes
                box_id =(i//3 , j//3)
                if box_id not in boxes:
                    boxes[box_id] = set()

                if val in boxes[box_id]:
                    return False
                    
                boxes[box_id].add(val)

        return True

                