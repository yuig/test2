package androidx.media3.datasource;

import a.a;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* renamed from: d, reason: collision with root package name */
    public final int f18780d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f18781e;

    public HttpDataSource$InvalidResponseCodeException(int i13, DataSourceException dataSourceException, Map map) {
        super(a.d("Response code: ", i13), dataSourceException, 2004);
        this.f18780d = i13;
        this.f18781e = map;
    }
}
