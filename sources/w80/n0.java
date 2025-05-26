package w80;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Size;
import com.pinterest.feature.ideaPinCreation.drawing.IdeaPinHandDrawingView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public Rect f128353r;

    /* renamed from: s, reason: collision with root package name */
    public int f128354s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ IdeaPinHandDrawingView f128355t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f128356u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(IdeaPinHandDrawingView ideaPinHandDrawingView, Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f128355t = ideaPinHandDrawingView;
        this.f128356u = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n0(this.f128355t, this.f128356u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Rect rect;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128354s;
        IdeaPinHandDrawingView ideaPinHandDrawingView = this.f128355t;
        if (i13 == 0) {
            ue.c.H(obj);
            if (!CollectionsKt.F0(ideaPinHandDrawingView.f46517i).isEmpty()) {
                Rect rect2 = new Rect();
                ko2.f fVar = ao2.v0.f20219a;
                m0 m0Var = new m0(ideaPinHandDrawingView, rect2, null);
                this.f128353r = rect2;
                this.f128354s = 1;
                Object M = kotlin.jvm.internal.j.M(this, fVar, m0Var);
                if (M == aVar) {
                    return aVar;
                }
                rect = rect2;
                obj = M;
            }
            return Unit.f80348a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rect = this.f128353r;
        ue.c.H(obj);
        Bitmap bitmap = (Bitmap) obj;
        ArrayList arrayList = ideaPinHandDrawingView.f46517i;
        arrayList.clear();
        arrayList.addAll(ideaPinHandDrawingView.f46516h);
        ideaPinHandDrawingView.invalidate();
        if (bitmap != null) {
            if (bitmap.getWidth() < 15 || bitmap.getHeight() < 15) {
                bitmap = t62.a.a(bitmap);
            }
            Size size = new Size(ideaPinHandDrawingView.getWidth(), ideaPinHandDrawingView.getHeight());
            int i14 = com.pinterest.shuffles.scene.composer.z.f52181a;
            Size c13 = com.pinterest.shuffles.scene.composer.z.c(size.getWidth(), bitmap.getWidth(), bitmap.getWidth(), bitmap.getWidth(), bitmap.getHeight());
            PointF b13 = com.pinterest.shuffles.scene.composer.z.b(size, rect.centerX(), rect.centerY());
            this.f128356u.invoke(new s80.v0(bitmap, bitmap.getWidth() / c13.getWidth(), new r72.l1(b13.x, b13.y)));
        }
        return Unit.f80348a;
    }
}
