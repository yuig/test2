package com.pinterest.anket.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import iz.c;
import iz.e;
import iz.h;
import iz.j;
import iz.m;
import iz.o;
import iz.q;
import iz.s;
import iz.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import nx.f1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/pinterest/anket/screen/AnketLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/anket/screen/a", "ANKET_SCALE", "ANKET_EMOJI", "ANKET_LIKE", "ANKET_TEXT", "ANKET_SINGLE", "ANKET_MULTIPLE", "ANKET_VIEW", "ANKET_VERTICAL_SCALE", "ANKET_START_MESSAGE", "ANKET_FINAL_MESSAGE", "anket_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class AnketLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ AnketLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<AnketLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final AnketLocation ANKET_SCALE = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_SCALE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35529a = m.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35530b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35531c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35532d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35529a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35531c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35532d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35530b;
        }
    };
    public static final AnketLocation ANKET_EMOJI = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_EMOJI

        /* renamed from: a, reason: collision with root package name */
        public final Class f35513a = c.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35514b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35515c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35516d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35513a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35515c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35516d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35514b;
        }
    };
    public static final AnketLocation ANKET_LIKE = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_LIKE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35521a = h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35522b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35523c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35524d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35521a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35523c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35524d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35522b;
        }
    };
    public static final AnketLocation ANKET_TEXT = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_TEXT

        /* renamed from: a, reason: collision with root package name */
        public final Class f35541a = s.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35542b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35543c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35544d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35541a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35543c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35544d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35542b;
        }
    };
    public static final AnketLocation ANKET_SINGLE = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_SINGLE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35533a = o.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35534b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35535c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35536d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35533a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35535c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35536d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35534b;
        }
    };
    public static final AnketLocation ANKET_MULTIPLE = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_MULTIPLE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35525a = j.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35526b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35527c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35528d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35525a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35527c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35528d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35526b;
        }
    };
    public static final AnketLocation ANKET_VIEW = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_VIEW

        /* renamed from: a, reason: collision with root package name */
        public final Class f35549a = hz.h.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35550b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35551c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35552d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35549a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35551c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35552d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35550b;
        }
    };
    public static final AnketLocation ANKET_VERTICAL_SCALE = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_VERTICAL_SCALE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35545a = u.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35546b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35547c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35548d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35545a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35547c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35548d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35546b;
        }
    };
    public static final AnketLocation ANKET_START_MESSAGE = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_START_MESSAGE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35537a = q.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35538b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35539c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35540d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35537a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35539c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35540d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35538b;
        }
    };
    public static final AnketLocation ANKET_FINAL_MESSAGE = new AnketLocation() { // from class: com.pinterest.anket.screen.AnketLocation.ANKET_FINAL_MESSAGE

        /* renamed from: a, reason: collision with root package name */
        public final Class f35517a = e.class;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f35518b = true;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f35519c = true;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f35520d = true;

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF35549a() {
            return this.f35517a;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldKeepOldScreenVisible, reason: from getter */
        public final boolean getF35551c() {
            return this.f35519c;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldNotActivateLastScreenVisible, reason: from getter */
        public final boolean getF35552d() {
            return this.f35520d;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF45109b() {
            return false;
        }

        @Override // com.pinterest.anket.screen.AnketLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldSkipTransitions, reason: from getter */
        public final boolean getF35550b() {
            return this.f35518b;
        }
    };

    private static final /* synthetic */ AnketLocation[] $values() {
        return new AnketLocation[]{ANKET_SCALE, ANKET_EMOJI, ANKET_LIKE, ANKET_TEXT, ANKET_SINGLE, ANKET_MULTIPLE, ANKET_VIEW, ANKET_VERTICAL_SCALE, ANKET_START_MESSAGE, ANKET_FINAL_MESSAGE};
    }

    static {
        AnketLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new f1(1);
    }

    public /* synthetic */ AnketLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static AnketLocation valueOf(String str) {
        return (AnketLocation) Enum.valueOf(AnketLocation.class, str);
    }

    public static AnketLocation[] values() {
        return (AnketLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF46913c() {
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
    public abstract /* synthetic */ Class getF35549a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF35551c() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF35552d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF45109b() {
        return super.getF45109b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF35550b() {
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

    private AnketLocation(String str, int i13) {
    }
}
