问题：Ambiguous mapping. Cannot map 'XXXXXController' method：
原因：@RequestMapping(value=XXX) 可能是同一个Controller或者 是不同的Controller。 XXX重名导致。