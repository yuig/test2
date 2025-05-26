package i20;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sq2.o;
import sq2.s;
import sq2.t;
import uj2.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Li20/a;", "", "", "deviceId", "contacts", "Luj2/b;", "a", "(Ljava/lang/String;Ljava/lang/String;)Luj2/b;", "contactsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface a {
    @o("address_book/{deviceId}/")
    @NotNull
    b a(@s("deviceId") @NotNull String deviceId, @t("contacts") @NotNull String contacts);
}
