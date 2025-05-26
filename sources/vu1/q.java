package vu1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import okhttp3.Interceptor;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126701i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f126702j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i13) {
        super(0);
        this.f126701i = i13;
        this.f126702j = sVar;
    }

    public final List b() {
        int i13 = this.f126701i;
        s sVar = this.f126702j;
        switch (i13) {
            case 0:
                List<Interceptor> interceptors = sVar.f126704a.interceptors();
                ArrayList arrayList = new ArrayList();
                for (Object obj : interceptors) {
                    if (!(((Interceptor) obj) instanceof su1.p)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                return sVar.f126704a.networkInterceptors();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f126701i) {
        }
        return b();
    }
}
