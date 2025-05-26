package s10;

import androidx.annotation.NonNull;
import com.pinterest.api.model.r40;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wz;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends r40 {

    /* renamed from: b, reason: collision with root package name */
    public final wz f110573b;

    /* renamed from: c, reason: collision with root package name */
    public final List f110574c;

    public a(@NonNull String str, @NonNull List<we0> list) {
        super(null, null, null, null, null, null, str);
        if (list.size() == 0) {
            return;
        }
        we0 we0Var = list.get(0);
        we0Var.getClass();
        this.f110573b = we0Var.u();
        this.f110574c = we0Var.v();
    }

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, wz wzVar, List<wz> list) {
        super(str, str2, str3, str4, str5, str6, str7);
        this.f110573b = wzVar;
        this.f110574c = list;
    }
}
