package com.pinterest.framework.screens;

import android.content.Context;
import androidx.lifecycle.t1;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"com/pinterest/framework/screens/ScreenManager$Companion", "", "Landroid/content/Context;", "context", "Lcom/pinterest/framework/screens/ScreenDescription;", "screenDescription", "Landroidx/lifecycle/t1;", "getViewModelStore", "(Landroid/content/Context;Lcom/pinterest/framework/screens/ScreenDescription;)Landroidx/lifecycle/t1;", "", "removeViewModelStore", "(Lcom/pinterest/framework/screens/ScreenDescription;)V", "removeAllViewModelStoresForContext", "(Landroid/content/Context;)V", "", "Lcom/pinterest/framework/screens/p;", "viewModelStores", "Ljava/util/Map;", "getViewModelStores", "()Ljava/util/Map;", "getViewModelStores$annotations", "()V", "", "DEFAULT_MAX_WARM_SCREENS", "I", "", "SCREEN_MANAGER", "Ljava/lang/String;", "SCREEN_MANAGER_CURRENT_TAB", "<init>", "framework-screens_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ScreenManager$Companion {
    private ScreenManager$Companion() {
    }

    public /* synthetic */ ScreenManager$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getViewModelStores$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeAllViewModelStoresForContext$lambda$1$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @NotNull
    public final t1 getViewModelStore(@NotNull Context context, @NotNull ScreenDescription screenDescription) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        p pVar = getViewModelStores().get(screenDescription);
        if (pVar != null) {
            if (pVar.f49219a != context.hashCode()) {
                getViewModelStores().put(screenDescription, p.a(pVar, context.hashCode()));
            }
            return pVar.f49220b;
        }
        int hashCode = context.hashCode();
        t1 t1Var = new t1();
        getViewModelStores().put(screenDescription, new p(hashCode, t1Var));
        return t1Var;
    }

    @NotNull
    public final Map<ScreenDescription, p> getViewModelStores() {
        return s.f49225o;
    }

    public final void removeAllViewModelStoresForContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<Map.Entry<ScreenDescription, p>> it = getViewModelStores().entrySet().iterator();
        it.forEachRemaining(new dg.c(new q(0, context, it), 2));
    }

    public final void removeViewModelStore(@NotNull ScreenDescription screenDescription) {
        t1 t1Var;
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        p remove = getViewModelStores().remove(screenDescription);
        if (remove == null || (t1Var = remove.f49220b) == null) {
            return;
        }
        t1Var.a();
    }
}
