package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@xk2.d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/api/model/VTOPinFeed;", "Lcom/pinterest/api/model/PinFeed;", "Lvd0/c;", "obj", "", "baseUrl", "Lb22/c;", "pinDeserializer", "<init>", "(Lvd0/c;Ljava/lang/String;Lb22/c;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VTOPinFeed extends PinFeed {

    /* renamed from: m, reason: collision with root package name */
    public final i70 f35592m;

    /* renamed from: n, reason: collision with root package name */
    public final f42.c f35593n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f35594o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VTOPinFeed(@NotNull vd0.c obj, @NotNull String baseUrl, @NotNull b22.c pinDeserializer) {
        super(obj, baseUrl, pinDeserializer);
        nm.q qVar;
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(pinDeserializer, "pinDeserializer");
        vd0.c m13 = obj.m("product_filters");
        int j13 = obj.j(0, "product_category");
        Object e13 = m13 != null ? vd0.c.f125622b.e(m13.f125623a, i70.class) : null;
        this.f35592m = e13 instanceof i70 ? (i70) e13 : null;
        f42.c.Companion.getClass();
        this.f35593n = f42.a.a(j13);
        vd0.a c13 = obj.c("makeup_layer_indices");
        if (c13 == null || (qVar = c13.f125618a) == null) {
            return;
        }
        ArrayList arrayList = qVar.f91364a;
        if (arrayList.size() > 0) {
            this.f35594o = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nm.s sVar = (nm.s) it.next();
            ArrayList arrayList2 = this.f35594o;
            if (arrayList2 != null) {
                arrayList2.add(Integer.valueOf(sVar.e()));
            }
        }
    }
}
