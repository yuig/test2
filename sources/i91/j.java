package i91;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71861i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f71862j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Context f71863k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f71864l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(n nVar, Context context, String str, int i13) {
        super(0);
        this.f71861i = i13;
        this.f71862j = nVar;
        this.f71863k = context;
        this.f71864l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f71861i) {
            case 0:
                m155invoke();
                break;
            case 1:
                m155invoke();
                break;
            default:
                m155invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m155invoke() {
        int i13 = this.f71861i;
        String str = this.f71864l;
        Context context = this.f71863k;
        n nVar = this.f71862j;
        switch (i13) {
            case 0:
                nVar.f(context, o.DOWNLOAD, str, null, 0);
                break;
            case 1:
                nVar.f(context, o.FACEBOOK_STORIES_SHARE, str, null, 0);
                break;
            default:
                nVar.f(context, o.INSTAGRAM_STORIES_SHARE, str, null, 0);
                break;
        }
    }
}
