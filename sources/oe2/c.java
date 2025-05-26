package oe2;

import io.embrace.android.embracesdk.internal.serialization.AppFrameworkAdapter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f94287h;

    /* renamed from: i, reason: collision with root package name */
    public r f94288i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Type[] f94289j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Type f94290k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Set f94291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Set f94292m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Type type, Set set, AppFrameworkAdapter appFrameworkAdapter, Method method, int i13, boolean z13, Type[] typeArr, Type type2, Set set2, Set set3, int i14) {
        super(type, set, appFrameworkAdapter, method, i13, 1, z13);
        this.f94287h = i14;
        this.f94289j = typeArr;
        this.f94290k = type2;
        this.f94291l = set2;
        this.f94292m = set3;
    }

    @Override // oe2.d
    public final void a(h0 h0Var, q qVar) {
        int i13 = this.f94287h;
        Set set = this.f94292m;
        Set set2 = this.f94291l;
        Type type = this.f94290k;
        Type[] typeArr = this.f94289j;
        switch (i13) {
            case 0:
                super.a(h0Var, qVar);
                this.f94288i = (kg.a.r(typeArr[0], type) && set2.equals(set)) ? h0Var.d(qVar, type, set) : h0Var.c(type, set, null);
                break;
            default:
                super.a(h0Var, qVar);
                this.f94288i = (kg.a.r(typeArr[0], type) && set2.equals(set)) ? h0Var.d(qVar, typeArr[0], set2) : h0Var.c(typeArr[0], set2, null);
                break;
        }
    }

    @Override // oe2.d
    public final Object b(v vVar) {
        switch (this.f94287h) {
            case 1:
                return c(this.f94288i.a(vVar));
            default:
                throw new AssertionError();
        }
    }

    @Override // oe2.d
    public final void d(h0 h0Var, y yVar, Object obj) {
        switch (this.f94287h) {
            case 0:
                this.f94288i.d(yVar, c(obj));
                return;
            default:
                throw new AssertionError();
        }
    }
}
