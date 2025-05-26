package vu1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.Interceptor;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126717i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f126718j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, int i13) {
        super(0);
        this.f126717i = i13;
        this.f126718j = vVar;
    }

    public final List b() {
        int i13 = this.f126717i;
        v vVar = this.f126718j;
        switch (i13) {
            case 0:
                List<Interceptor> interceptors = vVar.f126720a.interceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : interceptors) {
                    if (!(((Interceptor) obj) instanceof su1.p)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return vVar.f126720a.networkInterceptors();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f126717i) {
        }
        return b();
    }
}
