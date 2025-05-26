package ads_mobile_sdk;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class qd1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f10049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd1(String str, Uri uri) {
        super(0);
        this.f10048a = str;
        this.f10049b = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Saved " + this.f10048a + " to " + this.f10049b;
    }
}
