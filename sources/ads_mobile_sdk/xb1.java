package ads_mobile_sdk;

import a.sb;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class xb1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f13582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f13586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f13587f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f13588g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f13589h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Long f13590i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Long f13591j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ yb1 f13592k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ym0 f13593l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb1(Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l13, Long l14, yb1 yb1Var, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f13582a = activity;
        this.f13583b = str;
        this.f13584c = str2;
        this.f13585d = str3;
        this.f13586e = str4;
        this.f13587f = str5;
        this.f13588g = str6;
        this.f13589h = str7;
        this.f13590i = l13;
        this.f13591j = l14;
        this.f13592k = yb1Var;
        this.f13593l = ym0Var;
    }

    public static final void a(String str, String str2, String str3, Long l13, Long l14, yb1 yb1Var, DialogInterface dialogInterface, int i13) {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        data.putExtra("title", str);
        data.putExtra("eventLocation", str2);
        data.putExtra("description", str3);
        if (l13 != null) {
            data.putExtra("beginTime", l13.longValue());
        }
        if (l14 != null) {
            data.putExtra("endTime", l14.longValue());
        }
        data.setFlags(268435456);
        yb1Var.f14185c.a(data);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new xb1(this.f13582a, this.f13583b, this.f13584c, this.f13585d, this.f13586e, this.f13587f, this.f13588g, this.f13589h, this.f13590i, this.f13591j, this.f13592k, this.f13593l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xb1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f13582a, R.style.Theme.Material.Dialog.Alert);
        builder.setTitle(this.f13583b);
        builder.setMessage(this.f13584c);
        builder.setPositiveButton(this.f13585d, new a.rb(this.f13587f, this.f13588g, this.f13589h, this.f13590i, this.f13591j, this.f13592k));
        builder.setNegativeButton(this.f13586e, new sb(this.f13592k, this.f13593l, 1));
        builder.create().show();
        return Unit.f80348a;
    }

    public static final void a(yb1 yb1Var, ym0 ym0Var, DialogInterface dialogInterface, int i13) {
        kotlin.jvm.internal.j.z(yb1Var.f14186d, null, null, new wb1(yb1Var, ym0Var, "Operation denied by user.", null), 3);
    }
}
