package com.pinterest.feature.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import kd1.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import od1.t;
import org.jetbrains.annotations.NotNull;
import pe1.d;
import pe1.p;
import wd1.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/pinterest/feature/shopping/ShoppingFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/shopping/a", "RELATED_MODULE_FEED", "PINTEREST_PICKS_TAB", "SHOP_THE_LOOK_FEED", "WISHLIST_FEED", "WISHLIST", "VISUAL_SHOPPING", "SHOPPING_MODULE_LANDING_PAGE", "COMPLETE_THE_LOOK_SHEET", "shopping_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class ShoppingFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ ShoppingFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ShoppingFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final ShoppingFeatureLocation RELATED_MODULE_FEED = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.RELATED_MODULE_FEED

        /* renamed from: a, reason: collision with root package name */
        public final Class f48465a = p.class;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48465a;
        }
    };
    public static final ShoppingFeatureLocation PINTEREST_PICKS_TAB = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.PINTEREST_PICKS_TAB

        /* renamed from: a, reason: collision with root package name */
        public final Class f48464a = d.class;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        public final kl1.a getEarlyAccessKey() {
            return kl1.a.PinterestPicksTabKey;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48464a;
        }
    };

    @xk2.d
    public static final ShoppingFeatureLocation SHOP_THE_LOOK_FEED = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.SHOP_THE_LOOK_FEED

        /* renamed from: a, reason: collision with root package name */
        public final Class f48468a = b.class;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48468a;
        }
    };
    public static final ShoppingFeatureLocation WISHLIST_FEED = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.WISHLIST_FEED

        /* renamed from: a, reason: collision with root package name */
        public final Class f48472a = if1.b.class;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48472a;
        }
    };
    public static final ShoppingFeatureLocation WISHLIST = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.WISHLIST

        /* renamed from: a, reason: collision with root package name */
        public final Class f48471a = if1.d.class;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48471a;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ShoppingFeatureLocation VISUAL_SHOPPING = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.VISUAL_SHOPPING

        /* renamed from: a, reason: collision with root package name */
        public final Class f48469a = td1.b.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48470b = true;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48469a;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48470b() {
            return this.f48470b;
        }
    };
    public static final ShoppingFeatureLocation SHOPPING_MODULE_LANDING_PAGE = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.SHOPPING_MODULE_LANDING_PAGE

        /* renamed from: a, reason: collision with root package name */
        public final Class f48466a = t.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f48467b = true;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48466a;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48470b() {
            return this.f48467b;
        }
    };
    public static final ShoppingFeatureLocation COMPLETE_THE_LOOK_SHEET = new ShoppingFeatureLocation() { // from class: com.pinterest.feature.shopping.ShoppingFeatureLocation.COMPLETE_THE_LOOK_SHEET

        /* renamed from: a, reason: collision with root package name */
        public final Class f48460a = k.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f48461b = g.MODAL;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48462c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f48463d = true;

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF48461b() {
            return this.f48461b;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF48472a() {
            return this.f48460a;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF48462c() {
            return this.f48462c;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }

        @Override // com.pinterest.feature.shopping.ShoppingFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF48470b() {
            return this.f48463d;
        }
    };

    private static final /* synthetic */ ShoppingFeatureLocation[] $values() {
        return new ShoppingFeatureLocation[]{RELATED_MODULE_FEED, PINTEREST_PICKS_TAB, SHOP_THE_LOOK_FEED, WISHLIST_FEED, WISHLIST, VISUAL_SHOPPING, SHOPPING_MODULE_LANDING_PAGE, COMPLETE_THE_LOOK_SHEET};
    }

    static {
        ShoppingFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new com.pinterest.feature.board.permissions.b(29);
    }

    public /* synthetic */ ShoppingFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static ShoppingFeatureLocation valueOf(String str) {
        return (ShoppingFeatureLocation) Enum.valueOf(ShoppingFeatureLocation.class, str);
    }

    public static ShoppingFeatureLocation[] values() {
        return (ShoppingFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF48461b() {
        return g.DEFAULT;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    public kl1.a getEarlyAccessKey() {
        return kl1.a.LateAccessScreenKey;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getScreenClass */
    public abstract /* synthetic */ Class getF48472a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF48462c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF35552d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF46867b() {
        return super.getF46867b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF48470b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public /* bridge */ /* synthetic */ boolean getSupportsStateRestorationOnlyUseInEmergencies() {
        return true;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    public void onScreenNavigation() {
    }

    @Override // com.pinterest.framework.screens.ScreenLocation, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private ShoppingFeatureLocation(String str, int i13) {
    }
}
