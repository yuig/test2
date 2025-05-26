package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class l0 implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f18378b;

    public /* synthetic */ l0(w0 w0Var, int i13) {
        this.f18377a = i13;
        this.f18378b = w0Var;
    }

    public final void a(ActivityResult activityResult) {
        int i13 = this.f18377a;
        w0 w0Var = this.f18378b;
        switch (i13) {
            case 1:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) w0Var.F.pollLast();
                if (fragmentManager$LaunchedFragmentInfo != null) {
                    String str = fragmentManager$LaunchedFragmentInfo.f18238a;
                    Fragment c13 = w0Var.f18451c.c(str);
                    if (c13 != null) {
                        c13.onActivityResult(fragmentManager$LaunchedFragmentInfo.f18239b, activityResult.f15931a, activityResult.f15932b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) w0Var.F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo2 != null) {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f18238a;
                    Fragment c14 = w0Var.f18451c.c(str2);
                    if (c14 != null) {
                        c14.onActivityResult(fragmentManager$LaunchedFragmentInfo2.f18239b, activityResult.f15931a, activityResult.f15932b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
        }
    }

    @Override // g.a
    public final void c(Object obj) {
        switch (this.f18377a) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    iArr[i13] = ((Boolean) arrayList.get(i13)).booleanValue() ? 0 : -1;
                }
                w0 w0Var = this.f18378b;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) w0Var.F.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f18238a;
                    Fragment c13 = w0Var.f18451c.c(str);
                    if (c13 == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    } else {
                        c13.onRequestPermissionsResult(fragmentManager$LaunchedFragmentInfo.f18239b, strArr, iArr);
                        break;
                    }
                }
            case 1:
                a((ActivityResult) obj);
                break;
            default:
                a((ActivityResult) obj);
                break;
        }
    }
}
