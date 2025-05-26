package qo2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e1 extends o {

    /* renamed from: b, reason: collision with root package name */
    public final rl2.d f104547b;

    /* renamed from: c, reason: collision with root package name */
    public final c f104548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(rl2.d kClass, no2.b eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f104547b = kClass;
        this.f104548c = new c(eSerializer.a(), 0);
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104548c;
    }

    @Override // qo2.a
    public final Object f() {
        return new ArrayList();
    }

    @Override // qo2.a
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // qo2.a
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return com.bumptech.glide.c.D0(objArr);
    }

    @Override // qo2.a
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        return objArr.length;
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        kotlin.collections.z.d(null);
        throw null;
    }

    @Override // qo2.a
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        rl2.d eClass = this.f104547b;
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object newInstance = Array.newInstance((Class<?>) lb.l0.t0(eClass), arrayList.size());
        Intrinsics.g(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) newInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }

    @Override // qo2.o
    public final void n(int i13, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i13, obj2);
    }
}
