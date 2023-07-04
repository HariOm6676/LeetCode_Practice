class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        if coordinates[0][0]==coordinates[1][0]:
            for i in coordinates:
                if i[0]!=coordinates[0][0]:
                    return False
            return True
        elif coordinates[0][1]==coordinates[1][1]:
            for i in coordinates:
                if i[1]!=coordinates[0][1]:
                    return False
            return True
        else:
            m=(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0])
            # print(m)
            m1=coordinates[0][1]-m*coordinates[0][0]
            # print(m1)
            for i in coordinates:
                # print(i[0]-m*i[1])
                if (i[1]-m*i[0])!=m1:
                    return False
            return True