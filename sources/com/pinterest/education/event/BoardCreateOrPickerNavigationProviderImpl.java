package com.pinterest.education.event;

import androidx.annotation.Keep;
import com.pinterest.feature.board.BoardCreateOrPickerNavigation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.t;
import dh0.d;
import i32.y0;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rg0.n;
import rg0.y;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/pinterest/education/event/BoardCreateOrPickerNavigationProviderImpl;", "", "data", "Lcom/pinterest/navigation/Navigation;", "getNavigation", "(Ljava/lang/Object;)Lcom/pinterest/navigation/Navigation;", "<init>", "()V", "boardLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardCreateOrPickerNavigationProviderImpl {
    @NotNull
    public Navigation getNavigation(Object data) {
        NavigationImpl w13 = Navigation.w1((ScreenLocation) t.f51360a.getValue());
        BoardCreateOrPickerNavigation boardCreateOrPickerNavigation = new BoardCreateOrPickerNavigation();
        String str = data instanceof String ? (String) data : "";
        if (str.length() > 0) {
            boardCreateOrPickerNavigation.f45092f = str;
            boardCreateOrPickerNavigation.f45093g = false;
            boardCreateOrPickerNavigation.f45094h = true;
        }
        HashMap hashMap = new HashMap();
        y0 y0Var = y0.ANDROID_SEARCH_PIN_RESULTS_TAKEOVER;
        String valueOf = String.valueOf(y0Var.value());
        n b13 = ((d) y.a()).b(y0Var);
        if (b13 != null) {
            hashMap.put("usm_placement_id", valueOf);
            hashMap.put("usm_experience_id", String.valueOf(b13.f108060b));
        }
        boardCreateOrPickerNavigation.f45090d = hashMap;
        boardCreateOrPickerNavigation.f45091e = true;
        w13.y0(boardCreateOrPickerNavigation, "com.pinterest.EXTRA_BOARD_CREATE_OR_PICKER_NAVIGATION_OBJECT");
        return w13;
    }
}
