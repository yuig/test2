package f30;

import android.os.Build;
import df.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import m60.d;

/* loaded from: classes.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60979i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f60980j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f60979i = i13;
        this.f60980j = bVar;
    }

    public final String b() {
        int i13 = this.f60979i;
        b bVar = this.f60980j;
        switch (i13) {
            case 0:
                return j1.V(hf0.b.q() ? "Pinterest for Android Tablet/%s (%s; %s)" : "Pinterest for Android/%s (%s; %s)", ((d) bVar.f60982b).d(), bVar.f60984d, Build.VERSION.RELEASE);
            default:
                return (String) bVar.f60986f.getValue();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f60979i) {
        }
        return b();
    }
}
