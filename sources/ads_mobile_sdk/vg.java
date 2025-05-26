package ads_mobile_sdk;

import android.net.Uri;
import android.view.InputEvent;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes2.dex */
public final class vg extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Uri.Builder f12493a;

    /* renamed from: b, reason: collision with root package name */
    public int f12494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yg f12495c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f12496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg(yg ygVar, Uri uri, bl2.c cVar) {
        super(1, cVar);
        this.f12495c = ygVar;
        this.f12496d = uri;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new vg(this.f12495c, this.f12496d, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new vg(this.f12495c, this.f12496d, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Uri.Builder builder;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12494b;
        if (i13 == 0) {
            ue.c.H(obj);
            yg ygVar = this.f12495c;
            Uri uri = this.f12496d;
            ygVar.getClass();
            if (!z.i(uri.getQueryParameter("ase"), "3", false)) {
                return this.f12496d;
            }
            Uri.Builder buildUpon = this.f12496d.buildUpon();
            this.f12495c.f14235d.getClass();
            String valueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
            oh0 oh0Var = this.f12495c.f14236e;
            jh0 jh0Var = oh0.f9294r;
            buildUpon.appendQueryParameter((String) oh0Var.a("gads:debug_key_param_for_ara", "uk", jh0Var), valueOf);
            InputEvent inputEvent = this.f12495c.f14233b.f13901a;
            if (inputEvent == null) {
                return buildUpon.appendQueryParameter((String) this.f12495c.f14236e.a("gads:nis_param_for_ara", "nis", jh0Var), "11").build();
            }
            yg ygVar2 = this.f12495c;
            Uri uri2 = this.f12496d;
            ygVar2.getClass();
            Uri.Builder buildUpon2 = buildUpon.build().buildUpon();
            buildUpon2.appendQueryParameter("asr", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            buildUpon2.appendQueryParameter((String) ygVar2.f14236e.a("gads:nis_param_for_ara", "nis", jh0Var), "12");
            if (z.i(uri2.getQueryParameter("asrd"), SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, false)) {
                buildUpon2.authority((String) ygVar2.f14236e.a("gads:source_registration_domain_for_ara", "www.googleadservices.com", jh0Var));
            }
            Uri build = buildUpon2.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            zr zrVar = this.f12495c.f14234c;
            this.f12493a = buildUpon;
            this.f12494b = 1;
            zrVar.getClass();
            Object a13 = zr.a(zrVar, build, inputEvent, this);
            if (a13 == aVar) {
                return aVar;
            }
            builder = buildUpon;
            obj = a13;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            builder = this.f12493a;
            ue.c.H(obj);
        }
        a.ad adVar = (a.ad) obj;
        if (adVar == null) {
            return this.f12496d;
        }
        if (adVar instanceof pk0) {
            yg ygVar3 = this.f12495c;
            Intrinsics.f(builder);
            return builder.appendQueryParameter((String) ygVar3.f14236e.a("gads:nis_param_for_ara", "nis", oh0.f9294r), "12").build();
        }
        if (!(adVar instanceof kk0)) {
            yg ygVar4 = this.f12495c;
            Intrinsics.f(builder);
            return builder.appendQueryParameter((String) ygVar4.f14236e.a("gads:nis_param_for_ara", "nis", oh0.f9294r), "9").build();
        }
        kk0 kk0Var = (kk0) adVar;
        ((ks2) this.f12495c.f14237f).a("AttributionReportingManager.handleRegisterSource", kk0Var.f7342c);
        if (kk0Var.f7342c instanceof IllegalStateException) {
            yg ygVar5 = this.f12495c;
            Intrinsics.f(builder);
            return builder.appendQueryParameter((String) ygVar5.f14236e.a("gads:nis_param_for_ara", "nis", oh0.f9294r), "10").build();
        }
        yg ygVar6 = this.f12495c;
        Intrinsics.f(builder);
        return builder.appendQueryParameter((String) ygVar6.f14236e.a("gads:nis_param_for_ara", "nis", oh0.f9294r), "9").build();
    }
}
