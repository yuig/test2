package fg;

import bg.k;
import com.github.mustachejava.MustacheException;
import hp2.b;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class a implements k, b {

    /* renamed from: a, reason: collision with root package name */
    public final File f62109a;

    public a() {
        this.f62109a = null;
    }

    @Override // hp2.b
    public final FileChannel b() {
        return new FileInputStream(this.f62109a).getChannel();
    }

    @Override // bg.k
    public final Reader d(String str) {
        FileInputStream fileInputStream;
        File file = this.f62109a;
        File file2 = file == null ? new File(str) : new File(file, str);
        if (file2.exists() && file2.isFile()) {
            try {
                File canonicalFile = file == null ? new File("").getCanonicalFile() : file.getCanonicalFile();
                File canonicalFile2 = file2.getCanonicalFile();
                do {
                    canonicalFile2 = canonicalFile2.getParentFile();
                    if (canonicalFile2 == null) {
                        break;
                    }
                } while (!canonicalFile2.equals(canonicalFile));
                if (canonicalFile2 == null) {
                    throw new MustacheException("File not under root: " + canonicalFile.getAbsolutePath());
                }
                fileInputStream = new FileInputStream(file2);
            } catch (IOException e13) {
                throw new MustacheException("Found file, could not open: " + file2, e13);
            }
        } else {
            fileInputStream = null;
        }
        if (fileInputStream != null) {
            return new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
        }
        return null;
    }

    public a(File file) {
        this.f62109a = file;
    }
}
