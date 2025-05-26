package td;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class l implements d0, n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117414a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f117415b;

    public /* synthetic */ l(Context context, int i13) {
        this.f117414a = i13;
        this.f117415b = context;
    }

    @Override // td.d0
    public final c0 a(i0 i0Var) {
        int i13 = this.f117414a;
        Context context = this.f117415b;
        switch (i13) {
            case 0:
                return new o(context, this);
            case 1:
                return new o(context, this);
            case 2:
                return new o(context, this);
            case 3:
                return new z(context, 0);
            case 4:
                return new o(context, i0Var.c(Integer.class, AssetFileDescriptor.class));
            case 5:
                return new o(context, i0Var.c(Integer.class, InputStream.class));
            case 6:
                return new z(context, 1);
            default:
                return new z(context, 2);
        }
    }
}
