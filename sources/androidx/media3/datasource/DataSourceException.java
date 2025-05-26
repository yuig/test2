package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f18777b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f18778a;

    public DataSourceException(int i13) {
        this.f18778a = i13;
    }

    public DataSourceException(int i13, Throwable th3) {
        super(th3);
        this.f18778a = i13;
    }

    public DataSourceException(String str, int i13) {
        super(str);
        this.f18778a = i13;
    }

    public DataSourceException(int i13, String str, Throwable th3) {
        super(str, th3);
        this.f18778a = i13;
    }
}
