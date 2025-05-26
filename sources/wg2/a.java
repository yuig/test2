package wg2;

import il2.k;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import vg2.b;
import xh2.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f129893a;

    /* renamed from: b, reason: collision with root package name */
    public final File f129894b;

    /* renamed from: c, reason: collision with root package name */
    public final File f129895c;

    public a(d serializer, File storageDir) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(storageDir, "storageDir");
        this.f129893a = serializer;
        storageDir.mkdirs();
        File file = new File(storageDir, "most_recent_response");
        file.createNewFile();
        this.f129894b = file;
        File file2 = new File(storageDir, "etag");
        file2.createNewFile();
        this.f129895c = file2;
    }

    public final b a() {
        try {
            InputStream fileInputStream = new FileInputStream(this.f129894b);
            BufferedInputStream bufferedInputStream = fileInputStream instanceof BufferedInputStream ? (BufferedInputStream) fileInputStream : new BufferedInputStream(fileInputStream, 8192);
            try {
                RemoteConfig remoteConfig = (RemoteConfig) this.f129893a.g(bufferedInputStream, RemoteConfig.class);
                dl2.b.J(bufferedInputStream, null);
                String b13 = k.b(this.f129895c);
                if (b13.length() == 0) {
                    b13 = null;
                }
                return new b(remoteConfig, b13);
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
