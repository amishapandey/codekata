try:
	m1,m2=map(int,input().split())
	arr1=list(map(int,input().split()))
	l=[]
	for i in range(0,m1):
		if(arr1[i]%2==1):
			l.append(arr1[i])
		else:
			continue
	print(l[m2-1])
except ValueError:
	print("invalid")
