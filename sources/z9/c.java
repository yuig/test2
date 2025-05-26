package z9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lz9/c;", "Lz9/r0;", "Lz9/a;", "g4/u", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0})
@q0("activity")
/* loaded from: classes3.dex */
public class c extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public final Context f141164c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f141165d;

    public c(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f141164c = context;
        Iterator it = yn2.x.e(context, b.f141146j).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f141165d = (Activity) obj;
    }

    @Override // z9.r0
    public final z a() {
        Intrinsics.checkNotNullParameter(this, "activityNavigator");
        return new a(this);
    }

    @Override // z9.r0
    public final z c(z zVar, Bundle bundle, g0 g0Var) {
        Intent intent;
        int intExtra;
        a destination = (a) zVar;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.f141141k == null) {
            throw new IllegalStateException(a.a.n(new StringBuilder("Destination "), destination.f141329h, " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.f141141k);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = destination.f141142l;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!bundle.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f141165d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (g0Var != null && g0Var.f141188a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.f141329h);
        Context context = this.f141164c;
        Resources resources = context.getResources();
        if (g0Var != null) {
            int i13 = g0Var.f141195h;
            int i14 = g0Var.f141196i;
            if ((i13 <= 0 || !Intrinsics.d(resources.getResourceTypeName(i13), "animator")) && (i14 <= 0 || !Intrinsics.d(resources.getResourceTypeName(i14), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i13);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i14);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i13) + " and popExit resource " + resources.getResourceName(i14) + " when launching " + destination);
            }
        }
        context.startActivity(intent2);
        if (g0Var == null || activity == null) {
            return null;
        }
        int i15 = g0Var.f141193f;
        int i16 = g0Var.f141194g;
        if ((i15 <= 0 || !Intrinsics.d(resources.getResourceTypeName(i15), "animator")) && (i16 <= 0 || !Intrinsics.d(resources.getResourceTypeName(i16), "animator"))) {
            if (i15 < 0 && i16 < 0) {
                return null;
            }
            if (i15 < 0) {
                i15 = 0;
            }
            activity.overridePendingTransition(i15, i16 >= 0 ? i16 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i15) + " and exit resource " + resources.getResourceName(i16) + "when launching " + destination);
        return null;
    }

    @Override // z9.r0
    public final boolean j() {
        Activity activity = this.f141165d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
