#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main()
{
    int t,i,j,len,l,flag;
    char p[1000001],v[1000001];
    scanf("%d",&t);
    while(t--)
    {
        int t=0;
        scanf("%s",p);scanf("%s",v);
        len = strlen(p);l = strlen(v);
        
        for(i=0;i<=(len-l);i++)
        {
            flag=0;
            for(j=0;j<l;j++)
                if(p[i+j]==v[j])
                   flag++;
                
            if((flag==l)||(flag==(l-1)))
            {
                t=1;printf("%d ",i);
            }   
        }
        if(!t) printf("No Match!");
        printf("\n");
    }    
    return 0;
}    
