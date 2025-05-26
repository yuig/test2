package l11;

import android.content.Context;
import android.view.View;
import com.pinterest.feature.boardsection.pincarousel.view.BoardSectionPinCarousel;
import java.util.ArrayList;
import java.util.List;
import pk.a0;
import x02.i2;

/* loaded from: classes5.dex */
public final class l implements os.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81449a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81450b;

    /* renamed from: c, reason: collision with root package name */
    public final g11.a f81451c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.q f81452d;

    /* renamed from: e, reason: collision with root package name */
    public final uk2.f f81453e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f81454f;

    public l(Context context, ArrayList arrayList, g11.a aVar, uj2.q qVar, uk2.f fVar, i2 i2Var) {
        this.f81449a = context;
        this.f81450b = arrayList;
        this.f81451c = aVar;
        this.f81452d = qVar;
        this.f81453e = fVar;
        this.f81454f = i2Var;
    }

    @Override // os.b
    public final View create() {
        Context context = this.f81449a;
        BoardSectionPinCarousel boardSectionPinCarousel = new BoardSectionPinCarousel(context);
        boardSectionPinCarousel.b(a0.K(16, context.getResources()));
        yk1.j.a().d(boardSectionPinCarousel, new jo0.a(this.f81450b, this.f81453e, this.f81451c, this.f81452d, this.f81454f));
        return boardSectionPinCarousel;
    }
}
