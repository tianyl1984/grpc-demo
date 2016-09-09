
protoc --plugin=protoc-gen-grpc-java=D:/protoc-3.0.2-win32/bin/protoc-gen-grpc-java-1.0.0-windows-x86_64.exe demo.proto --grpc-java_out=../grpc-server/src/main/java/

protoc demo.proto --java_out=../grpc-server/src/main/java/

protoc --plugin=protoc-gen-grpc-java=D:/protoc-3.0.2-win32/bin/protoc-gen-grpc-java-1.0.0-windows-x86_64.exe demo.proto --grpc-java_out=../grpc-client/src/main/java/

protoc demo.proto --java_out=../grpc-client/src/main/java/
