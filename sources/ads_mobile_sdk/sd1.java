package ads_mobile_sdk;

import a.sb;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class sd1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f11051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f11055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vd1 f11056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f11057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f11058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11059i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ym0 f11060j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd1(Activity activity, String str, String str2, String str3, String str4, vd1 vd1Var, String str5, String str6, String str7, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f11051a = activity;
        this.f11052b = str;
        this.f11053c = str2;
        this.f11054d = str3;
        this.f11055e = str4;
        this.f11056f = vd1Var;
        this.f11057g = str5;
        this.f11058h = str6;
        this.f11059i = str7;
        this.f11060j = ym0Var;
    }

    public static final void a(vd1 vd1Var, String str, String str2, String str3, Activity activity, ym0 ym0Var, DialogInterface dialogInterface, int i13) {
        kotlin.jvm.internal.j.z(vd1Var.f12458d, null, null, new ud1(vd1Var, str, ym0Var, str2, str3, activity, null), 3);
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new sd1(this.f11051a, this.f11052b, this.f11053c, this.f11054d, this.f11055e, this.f11056f, this.f11057g, this.f11058h, this.f11059i, this.f11060j, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sd1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        new AlertDialog.Builder(this.f11051a, R.style.Theme.Material.Dialog.Alert).setTitle(this.f11052b).setMessage(this.f11053c).setPositiveButton(this.f11054d, new a.rb(this.f11056f, this.f11057g, this.f11058h, this.f11059i, this.f11051a, this.f11060j)).setNegativeButton(this.f11055e, new sb(this.f11056f, this.f11060j, 0)).create().show();
        return Unit.f80348a;
    }

    public static final void a(vd1 vd1Var, ym0 ym0Var, DialogInterface dialogInterface, int i13) {
        Regex regex = vd1.f12454i;
        vd1Var.a("User canceled the download.", ym0Var, false);
    }
}
