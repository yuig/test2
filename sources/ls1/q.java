package ls1;

import android.graphics.Rect;
import android.view.View;
import com.pinterest.api.model.f30;

/* loaded from: classes2.dex */
public class q extends m10.d {

    /* renamed from: e */
    public final int f84714e;

    /* renamed from: f */
    public final int f84715f;

    /* renamed from: g */
    public final int f84716g;

    /* renamed from: h */
    public final vn1.c f84717h;

    /* renamed from: i */
    public final String f84718i;

    /* renamed from: j */
    public final boolean f84719j;

    /* renamed from: k */
    public final boolean f84720k;

    /* renamed from: l */
    public final Rect f84721l;

    public q(View view, f30 f30Var) {
        this(view, f30Var, -1, -1, vn1.c.DEFAULT, false, null, true, -1, null, null, -1);
    }

    public q(View view, f30 f30Var, int i13, int i14, vn1.c cVar, boolean z13, String str, boolean z14, int i15, Rect rect, Rect rect2, int i16) {
        super(view, f30Var, rect, i16);
        this.f84714e = i13;
        this.f84716g = i14;
        this.f84717h = cVar;
        this.f84719j = z13;
        this.f84720k = z14;
        this.f84718i = str;
        this.f84715f = i15;
        this.f84721l = rect2;
    }
}
