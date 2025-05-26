package ja;

import a8.n0;
import android.os.RemoteException;
import android.util.Log;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75276b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f75277c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String[] strArr, h0 h0Var) {
        super(strArr);
        this.f75277c = h0Var;
    }

    @Override // ja.p
    public final boolean a() {
        switch (this.f75276b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // ja.p
    public final void b(Set tables) {
        int i13 = this.f75276b;
        Object obj = this.f75277c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(tables, "tables");
                if (!((AtomicBoolean) ((n0) obj).f1409i).get()) {
                    try {
                        m mVar = (m) ((n0) obj).f1407g;
                        if (mVar != null) {
                            mVar.x((String[]) tables.toArray(new String[0]), ((n0) obj).f1402b);
                            break;
                        }
                    } catch (RemoteException e13) {
                        Log.w("ROOM", "Cannot broadcast invalidation", e13);
                        return;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(tables, "tables");
                o.b l13 = o.b.l();
                g0 g0Var = ((h0) obj).f75241u;
                if (!l13.m()) {
                    l13.n(g0Var);
                    break;
                } else {
                    g0Var.run();
                    break;
                }
        }
    }
}
