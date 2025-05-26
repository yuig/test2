package pq2;

import java.util.Objects;
import okhttp3.FormBody;

/* loaded from: classes2.dex */
public final class k0 extends k1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101048c;

    /* renamed from: d, reason: collision with root package name */
    public final String f101049d;

    /* renamed from: e, reason: collision with root package name */
    public final p f101050e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101051f;

    public k0(String str, p pVar, boolean z13, int i13) {
        this.f101048c = i13;
        if (i13 == 1) {
            Objects.requireNonNull(str, "name == null");
            this.f101049d = str;
            this.f101050e = pVar;
            this.f101051f = z13;
            return;
        }
        if (i13 != 2) {
            Objects.requireNonNull(str, "name == null");
            this.f101049d = str;
            this.f101050e = pVar;
            this.f101051f = z13;
            return;
        }
        Objects.requireNonNull(str, "name == null");
        this.f101049d = str;
        this.f101050e = pVar;
        this.f101051f = z13;
    }

    @Override // pq2.k1
    public final void a(x0 x0Var, Object obj) {
        String str;
        String str2;
        String str3;
        int i13 = this.f101048c;
        boolean z13 = this.f101051f;
        String str4 = this.f101049d;
        p pVar = this.f101050e;
        switch (i13) {
            case 0:
                if (obj != null && (str = (String) pVar.a(obj)) != null) {
                    FormBody.Builder builder = x0Var.f101110j;
                    if (!z13) {
                        builder.a(str4, str);
                        break;
                    } else {
                        builder.b(str4, str);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null && (str2 = (String) pVar.a(obj)) != null) {
                    x0Var.a(str4, str2, z13);
                    break;
                }
                break;
            default:
                if (obj != null && (str3 = (String) pVar.a(obj)) != null) {
                    x0Var.b(str4, str3, z13);
                    break;
                }
                break;
        }
    }
}
