package i72;

import android.graphics.Bitmap;
import android.graphics.Rect;
import ao2.j0;
import dl2.j;
import e72.c0;
import e72.d0;
import e72.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f71676r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f71677s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bitmap f71678t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Rect f71679u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f71680v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list, boolean z13, Bitmap bitmap, Rect rect, g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f71676r = list;
        this.f71677s = z13;
        this.f71678t = bitmap;
        this.f71679u = rect;
        this.f71680v = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f71676r, this.f71677s, this.f71678t, this.f71679u, this.f71680v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        List<d0> list = this.f71676r;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (d0 d0Var : list) {
            if (this.f71677s) {
                Bitmap bitmap = this.f71678t;
                c0 image_size = new c0(bitmap.getWidth(), bitmap.getHeight());
                y yVar = d0Var.f57635e;
                int i13 = yVar.f57694a;
                Rect rect = this.f71679u;
                int i14 = i13 + rect.left;
                int i15 = yVar.f57695b + rect.top;
                int i16 = yVar.f57696c;
                int i17 = yVar.f57697d;
                yVar.getClass();
                y bbox = new y(i14, i15, i16, i17);
                String id3 = d0Var.f57631a;
                Intrinsics.checkNotNullParameter(id3, "id");
                String type = d0Var.f57632b;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(image_size, "image_size");
                Intrinsics.checkNotNullParameter(bbox, "bbox");
                String image_base64 = d0Var.f57636f;
                Intrinsics.checkNotNullParameter(image_base64, "image_base64");
                d0Var = new d0(id3, type, d0Var.f57633c, image_size, bbox, image_base64);
            }
            arrayList.add(this.f71680v.f71693c.c(d0Var));
        }
        return arrayList;
    }
}
