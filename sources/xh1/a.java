package xh1;

import android.graphics.Bitmap;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.user.group.view.GroupUserImageView;
import de.c;
import hs1.x;
import java.lang.ref.WeakReference;
import pk.a0;

/* loaded from: classes5.dex */
public final class a implements hs1.a {

    /* renamed from: a, reason: collision with root package name */
    public String f134982a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f134983b;

    /* renamed from: c, reason: collision with root package name */
    public c f134984c;

    @Override // hs1.a
    public final void B0(Bitmap bitmap, x xVar) {
        WeakReference weakReference = this.f134983b;
        if (weakReference != null) {
            wh1.a aVar = (wh1.a) weakReference.get();
            if (aVar == null) {
                this.f134983b = null;
                return;
            }
            String str = this.f134982a;
            if (aVar.isBound()) {
                int min = Math.min(aVar.f129918a.size(), 3);
                for (int i13 = 0; i13 < min; i13++) {
                    wy0 wy0Var = (wy0) aVar.f129918a.get(i13);
                    if (a0.N(wy0Var.l3(), str) || a0.N(wy0Var.k3(), str)) {
                        vh1.a aVar2 = (vh1.a) aVar.getView();
                        ((GroupUserImageView) aVar2).f48971b[i13] = bitmap;
                        aVar2.postInvalidateDelayed(1L);
                        return;
                    }
                }
            }
        }
    }

    @Override // hs1.a
    public final void J1() {
        p1(true);
    }

    @Override // ee.i
    /* renamed from: K0 */
    public final c getF44637j() {
        return this.f134984c;
    }

    @Override // ee.i
    public final void Z(c cVar) {
        this.f134984c = cVar;
    }

    @Override // hs1.a
    public final void n1(String str) {
        this.f134982a = str;
    }

    @Override // hs1.a
    public final void p1(boolean z13) {
        this.f134982a = null;
        this.f134983b = null;
    }

    @Override // hs1.a
    public final void y1() {
    }
}
