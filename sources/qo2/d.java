package qo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104539b;

    /* renamed from: c, reason: collision with root package name */
    public final c f104540c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(no2.b eSerializer, int i13) {
        super(eSerializer);
        this.f104539b = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(eSerializer, "element");
            this.f104540c = new c(eSerializer.a(), 1);
        } else {
            Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
            super(eSerializer);
            this.f104540c = new c(eSerializer.a(), 2);
        }
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104540c;
    }

    @Override // qo2.a
    public final Object f() {
        switch (this.f104539b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // qo2.a
    public final int g(Object obj) {
        switch (this.f104539b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                return linkedHashSet.size();
        }
    }

    @Override // qo2.a
    public final Object l(Object obj) {
        switch (this.f104539b) {
            case 0:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new ArrayList((Collection) null);
            default:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // qo2.a
    public final Object m(Object obj) {
        switch (this.f104539b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                return linkedHashSet;
        }
    }

    @Override // qo2.o
    public final void n(int i13, Object obj, Object obj2) {
        switch (this.f104539b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                arrayList.add(i13, obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
                linkedHashSet.add(obj2);
                break;
        }
    }
}
