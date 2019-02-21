一. 文件的基本属性

    1.查看文件的属性和权限
    ls -l
    dr-xr-xr-x  2 root root 4096 Dec 14 2018 bin
    dr-xr-xr-x  4 root root 4096 Apr 19 2018 boot
    ....
    [d] 表示目录
    [-] 表示文件
    [l] 表示链接文档

    r:4 w:2 x:1
    rwx = 4+2+1 = 7
    --- = 0+0+0 = 0

二. 文件与目录管理
     1.处理目录的常用命令
     mkdir: 创建一个新的目录
     rmdir：删除一个空的目录
     cp：复制文件或目录
     rm：移除文件或目录
     mv：移动文件与目录

    mkdir -m 711 test 创建一个 drwx--x--x test 目录
    mkdir -p 递归创建目录

    tail 取出文件后面几行
      -f 表示持续侦测后面所接的档名 ctrl+c 结束
    tail -f catalina.out

    man[命令]来查看各个命令的使用文档 man cp
