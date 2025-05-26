package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import wo2.j;
import wo2.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FormBody extends RequestBody {

    /* renamed from: d, reason: collision with root package name */
    public static final MediaType f95612d;

    /* renamed from: b, reason: collision with root package name */
    public final List f95613b;

    /* renamed from: c, reason: collision with root package name */
    public final List f95614c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f95615a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f95616b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f95617c;

        public Builder() {
            this(0);
        }

        public final void a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f95616b;
            HttpUrl.Companion companion = HttpUrl.f95629k;
            arrayList.add(HttpUrl.Companion.b(companion, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f95615a, 91));
            this.f95617c.add(HttpUrl.Companion.b(companion, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f95615a, 91));
        }

        public final void b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f95616b;
            HttpUrl.Companion companion = HttpUrl.f95629k;
            arrayList.add(HttpUrl.Companion.b(companion, name, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f95615a, 83));
            this.f95617c.add(HttpUrl.Companion.b(companion, value, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f95615a, 83));
        }

        public Builder(int i13) {
            this.f95615a = null;
            this.f95616b = new ArrayList();
            this.f95617c = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/FormBody$Companion;", "", "()V", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    static {
        new Companion(0);
        MediaType.f95651d.getClass();
        f95612d = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList encodedNames, ArrayList encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f95613b = Util.A(encodedNames);
        this.f95614c = Util.A(encodedValues);
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return e(null, true);
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b */
    public final MediaType getF95665d() {
        return f95612d;
    }

    @Override // okhttp3.RequestBody
    public final void d(k sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        e(sink, false);
    }

    public final long e(k kVar, boolean z13) {
        j l13;
        if (z13) {
            l13 = new j();
        } else {
            Intrinsics.f(kVar);
            l13 = kVar.l();
        }
        List list = this.f95613b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 > 0) {
                l13.a0(38);
            }
            l13.r0((String) list.get(i13));
            l13.a0(61);
            l13.r0((String) this.f95614c.get(i13));
        }
        if (!z13) {
            return 0L;
        }
        long j13 = l13.f130711b;
        l13.a();
        return j13;
    }
}
