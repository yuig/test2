package il2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.FileWalkDirection;
import kotlin.io.NoSuchFileException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public class m extends l {
    public static void e(File file, File target) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            Intrinsics.checkNotNullParameter(file, "file");
            throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new FileSystemException(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                bs1.c.K(fileInputStream, fileOutputStream, 8192);
                dl2.b.J(fileOutputStream, null);
                dl2.b.J(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                dl2.b.J(fileInputStream, th3);
                throw th4;
            }
        }
    }

    public static boolean f(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.BOTTOM_UP;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        while (true) {
            boolean z13 = true;
            for (File file : new i(start, direction, null, null, null, 0, 32, null)) {
                if (file.delete() || !file.exists()) {
                    if (z13) {
                        break;
                    }
                }
                z13 = false;
            }
            return z13;
        }
    }

    public static String g(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.b0('.', name, "");
    }

    public static String h(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.f0(name, ".", name);
    }
}
