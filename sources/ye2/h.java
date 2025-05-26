package ye2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import df.j1;
import so.oa;
import so.s8;
import so.x8;

/* loaded from: classes2.dex */
public final class h implements af2.b {

    /* renamed from: b, reason: collision with root package name */
    public volatile af2.a f138915b;

    /* renamed from: d, reason: collision with root package name */
    public final Object f138917d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138914a = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f138916c = new Object();

    public h(rd.j jVar) {
        this.f138917d = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.Context] */
    public static final Context b(m mVar) {
        m mVar2 = mVar;
        while ((mVar2 instanceof ContextWrapper) && !(mVar2 instanceof Activity)) {
            mVar2 = mVar2.getBaseContext();
        }
        return mVar2;
    }

    public final x8 a() {
        Fragment fragment = (Fragment) this.f138917d;
        if (fragment.getHost() == null) {
            throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
        }
        d7.b.q(fragment.getHost() instanceof af2.b, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment.getHost().getClass());
        s8 s8Var = (s8) ((i) j1.b0(i.class, fragment.getHost()));
        oa oaVar = s8Var.f114255d;
        fragment.getClass();
        return new x8(oaVar, s8Var.f114269e, s8Var.f114284f);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        switch (this.f138914a) {
            case 0:
                if (this.f138915b == null) {
                    synchronized (this.f138916c) {
                        try {
                            if (this.f138915b == null) {
                                this.f138915b = (af2.a) ((rd.j) this.f138917d).h();
                            }
                        } finally {
                        }
                    }
                }
                return this.f138915b;
            default:
                if (this.f138915b == null) {
                    synchronized (this.f138916c) {
                        try {
                            if (this.f138915b == null) {
                                this.f138915b = a();
                            }
                        } finally {
                        }
                    }
                }
                return this.f138915b;
        }
    }

    public h(Fragment fragment) {
        this.f138917d = fragment;
    }
}
