# Windows安装Minio服务

# 下载服务

下载链接🔗：[minio-lasted](https://gitcode.net/dreamer/minio/-/archive/lasted/minio-lasted.zip?_blank)

# 注册服务

**以管理员身份运行cmd**，进入你存放minio的目录下，输入以下命令

```bash
minio-server.exe install
```

# 启动服务

- 方式一：**以管理员身份运行cmd**，进入你存放minio的目录下，输入以下命令

```bash
net start minio
```

- 方式二：进入任务管理器，查看服务列表，手动开启，或修改服务启动配置

# 使用服务

- 在浏览器访问minio控制台：[http://127.0.0.1:9000](http://localhost:9000)

- 账号和密码都是：**minioadmin**

- 服务器地址：[http://127.0.0.1:9090](http://localhost:9090)

# 关闭服务

- 方式一：**以管理员身份运行cmd**，进入你存放minio的目录下，输入以下命令

```bash
net stop minio
```

- 方式二：进入任务管理器，查看服务列表，手动关闭服务

# 卸载服务

**以管理员身份运行cmd**，进入你存放minio的目录下，输入以下命令

```bash
minio-server.exe uninstall
```

