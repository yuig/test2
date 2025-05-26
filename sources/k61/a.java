package k61;

import a.cb;
import android.view.View;
import dl1.s;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final b71.d f78394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78395b;

    /* renamed from: c, reason: collision with root package name */
    public final View.OnClickListener f78396c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f78397d;

    public a(@NotNull b71.d searchTypo, @NotNull String searchMessage, @NotNull View.OnClickListener onClickListener, HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(searchTypo, "searchTypo");
        Intrinsics.checkNotNullParameter(searchMessage, "searchMessage");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f78394a = searchTypo;
        this.f78395b = searchMessage;
        this.f78396c = onClickListener;
        this.f78397d = hashMap;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String simpleName = a.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f78394a, aVar.f78394a) && Intrinsics.d(this.f78395b, aVar.f78395b) && Intrinsics.d(this.f78396c, aVar.f78396c) && Intrinsics.d(this.f78397d, aVar.f78397d);
    }

    public final int hashCode() {
        int hashCode = (this.f78396c.hashCode() + cb.d(this.f78395b, this.f78394a.hashCode() * 31, 31)) * 31;
        HashMap hashMap = this.f78397d;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final String toString() {
        return "NagViewModel(searchTypo=" + this.f78394a + ", searchMessage=" + this.f78395b + ", onClickListener=" + this.f78396c + ", auxData=" + this.f78397d + ")";
    }
}
