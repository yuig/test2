package kotlin.io;

import java.io.File;
import java.io.IOException;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/FileSystemException;", "Ljava/io/IOException;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FileSystemException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemException(File file, File file2, String str) {
        super(t.g(file, file2, str));
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
