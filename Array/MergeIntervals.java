/*
����һ������ļ���, ��ϲ������ص������䡣

ʾ����
���� [1,3],[2,6],[8,10],[15,18],
���� [1,6],[8,10],[15,18].
*/



/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<=1)
            return intervals;
         intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));	//�������е�Ԫ�ذ�start��������
        
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        List<Interval> res=new ArrayList<Interval>();
        
        for(Interval interval:intervals){
            if(end>=interval.start){
                end=Math.max(end,interval.end);
            }
            else{
                res.add(new Interval(start,end));
                start=interval.start;
                end=interval.end;
            }
        }
        res.add(new Interval(start,end));	//������һ��Ԫ��
        return res;
    }
}