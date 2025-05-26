package w80;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ IdeaPinHandDrawingView f128345r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Rect f128346s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(IdeaPinHandDrawingView ideaPinHandDrawingView, Rect rect, bl2.c cVar) {
        super(2, cVar);
        this.f128345r = ideaPinHandDrawingView;
        this.f128346s = rect;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f128345r, this.f128346s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13;
        int i14;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        IdeaPinHandDrawingView ideaPinHandDrawingView = this.f128345r;
        if (!ideaPinHandDrawingView.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(ideaPinHandDrawingView.getWidth(), ideaPinHandDrawingView.getHeight(), config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-ideaPinHandDrawingView.getScrollX(), -ideaPinHandDrawingView.getScrollY());
        ideaPinHandDrawingView.draw(canvas);
        id2.c.Companion.getClass();
        int i15 = 0;
        id2.c bgColor = id2.b.a(0);
        Intrinsics.checkNotNullParameter(createBitmap, "<this>");
        Intrinsics.checkNotNullParameter(bgColor, "bgColor");
        Rect outRect = this.f128346s;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        int a13 = bgColor.a();
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        int[] iArr = new int[width * height];
        createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i16 = 1;
        kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, height), 1);
        int i17 = p13.f80453a;
        int i18 = p13.f80454b;
        int i19 = p13.f80455c;
        if ((i19 <= 0 || i17 > i18) && (i19 >= 0 || i18 > i17)) {
            i13 = 0;
            i14 = 0;
        } else {
            int i23 = 0;
            i14 = 0;
            int i24 = width;
            while (true) {
                kotlin.ranges.a p14 = ql2.s.p(ql2.s.q(i15, width), i16);
                int i25 = p14.f80453a;
                int i26 = p14.f80454b;
                int i27 = p14.f80455c;
                if ((i27 > 0 && i25 <= i26) || (i27 < 0 && i26 <= i25)) {
                    while (true) {
                        if (iArr[(i17 * width) + i25] != a13) {
                            if (i25 < i24) {
                                i24 = i25;
                            }
                            if (i25 > i23) {
                                i23 = i25;
                            }
                            if (i17 < height) {
                                height = i17;
                            }
                            if (i17 > i14) {
                                i14 = i17;
                            }
                        }
                        if (i25 == i26) {
                            break;
                        }
                        i25 += i27;
                    }
                }
                if (i17 == i18) {
                    break;
                }
                i17 += i19;
                i15 = 0;
                i16 = 1;
            }
            width = i24;
            i13 = i23;
        }
        if (i13 < width || i14 < height) {
            return null;
        }
        outRect.set(width, height, i13, i14);
        return Bitmap.createBitmap(createBitmap, width, height, (i13 - width) + 1, (i14 - height) + 1);
    }
}
