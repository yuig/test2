package ud;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import td.c0;
import td.d0;
import td.i0;

/* loaded from: classes.dex */
public abstract class b implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f121907a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f121908b;

    public b(Context context, Class cls) {
        this.f121907a = context;
        this.f121908b = cls;
    }

    @Override // td.d0
    public final c0 a(i0 i0Var) {
        Class cls = this.f121908b;
        return new e(this.f121907a, i0Var.c(File.class, cls), i0Var.c(Uri.class, cls), cls);
    }
}
