package zf;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final wf.a f141824g;

    public b(wf.a aVar, org.chromium.net.y yVar, ag.j jVar) {
        super(yVar, jVar);
        new RectF();
        new RectF();
        this.f141824g = aVar;
        Paint paint = new Paint(1);
        this.f141834d = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f141834d.setColor(Color.rgb(0, 0, 0));
        this.f141834d.setAlpha(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL);
        new Paint(1).setStyle(style);
        new Paint(1).setStyle(Paint.Style.STROKE);
    }

    @Override // zf.h
    public final void q(Canvas canvas) {
        this.f141824g.f();
        throw null;
    }

    @Override // zf.h
    public final void r(Canvas canvas) {
    }

    @Override // zf.h
    public final void s(Canvas canvas, vf.c[] cVarArr) {
        this.f141824g.f();
        if (cVarArr.length <= 0) {
            return;
        }
        int i13 = cVarArr[0].f125770f;
        throw null;
    }

    @Override // zf.h
    public void t(Canvas canvas) {
        wf.a aVar = this.f141824g;
        if (v(aVar)) {
            aVar.f();
            throw null;
        }
    }

    @Override // zf.h
    public void u() {
        this.f141824g.f();
        throw null;
    }
}
