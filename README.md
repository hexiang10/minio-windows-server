# Windows安装Minio服务

## 1. 下载服务

下载地址：[minio-server-v1.0.0](https://github.com/hexiang10/minio-windows-server/releases/download/v1.0.0/minio-server-v1.0.0.7z?_blank)

## 2. 注册服务

**以管理员身份运行cmd**，进入你下载好minio的存放目录，输入以下命令

```bash
minio-server.exe install
```

## 3. 启动服务

- 方式一：**以管理员身份运行cmd**，进入你存放minio的目录下，输入以下命令

```bash
net start minio
```

- 方式二：进入任务管理器，查看服务列表，手动开启，或修改服务启动配置

## 4. 使用服务

- 控制台地址：[http://127.0.0.1:9090](http://127.0.0.1:9090)

- 服务器地址：[http://127.0.0.1:9000](http://127.0.0.1:9000)

- 账号和密码都是：**minioadmin**

## 5. 关闭服务

- 方式一：**以管理员身份运行cmd**，进入你存放minio的目录下，输入以下命令

```bash
net stop minio
```

- 方式二：进入任务管理器，查看服务列表，手动关闭服务

## 6. 卸载服务

**以管理员身份运行cmd**，进入你存放minio的目录下，输入以下命令

```bash
minio-server.exe uninstall
```

