package ads_mobile_sdk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class xi1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.ad f13683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13684b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f13685c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f13687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi1(a.ad adVar, String str, double d2, int i13, int i14) {
        super(0);
        this.f13683a = adVar;
        this.f13684b = str;
        this.f13685c = d2;
        this.f13686d = i13;
        this.f13687e = i14;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), (Bitmap) ((pk0) this.f13683a).f9719b);
        Uri parse = Uri.parse(this.f13684b);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
        return new rz0(bitmapDrawable, parse, this.f13685c, this.f13686d, this.f13687e);
    }
}
