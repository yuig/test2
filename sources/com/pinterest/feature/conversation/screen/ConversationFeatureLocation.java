package com.pinterest.feature.conversation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.pinterest.feature.board.permissions.b;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.framework.screens.g;
import cp.f;
import cp.n;
import cp.u;
import iq0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lq0.o0;
import lq0.r1;
import lq0.v0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/pinterest/feature/conversation/screen/ConversationFeatureLocation;", "", "Lcom/pinterest/framework/screens/ScreenLocation;", "", "onScreenNavigation", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "<init>", "(Ljava/lang/String;I)V", "Companion", "com/pinterest/feature/conversation/screen/a", "CONVERSATION", "CONVERSATION_CREATE", "CONVERSATION_INBOX", "CONTACT_REQUEST_INBOX", "CONVERSATION_SEND_A_PIN_TAB_HOST", "CONVERSATION_SEND_A_PIN_RELATED_PINS", "CONVERSATION_SEND_A_PIN_USER_PINS", "CONVERSATION_THREAD", "CONTACT_REQUEST_UNDER_18_WARNING", "CONVERSATION_SETTINGS", "INBOX_MESSAGES_AND_CONTACTS", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class ConversationFeatureLocation implements ScreenLocation {
    private static final /* synthetic */ el2.a $ENTRIES;
    private static final /* synthetic */ ConversationFeatureLocation[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<ConversationFeatureLocation> CREATOR;

    @NotNull
    public static final a Companion;
    public static final ConversationFeatureLocation CONVERSATION = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION

        /* renamed from: a, reason: collision with root package name */
        public final Class f45512a = o0.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45512a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONVERSATION_CREATE = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION_CREATE

        /* renamed from: a, reason: collision with root package name */
        public final Class f45513a = n.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45513a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONVERSATION_INBOX = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION_INBOX

        /* renamed from: a, reason: collision with root package name */
        public final Class f45514a = u.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45514a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONTACT_REQUEST_INBOX = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONTACT_REQUEST_INBOX

        /* renamed from: a, reason: collision with root package name */
        public final Class f45510a = f.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45510a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONVERSATION_SEND_A_PIN_TAB_HOST = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION_SEND_A_PIN_TAB_HOST

        /* renamed from: a, reason: collision with root package name */
        public final Class f45516a = e.class;

        /* renamed from: b, reason: collision with root package name */
        public final g f45517b = g.MODAL;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getDisplayMode, reason: from getter */
        public final g getF45517b() {
            return this.f45517b;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45516a;
        }
    };
    public static final ConversationFeatureLocation CONVERSATION_SEND_A_PIN_RELATED_PINS = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION_SEND_A_PIN_RELATED_PINS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45515a = iq0.a.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45515a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONVERSATION_SEND_A_PIN_USER_PINS = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION_SEND_A_PIN_USER_PINS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45518a = iq0.g.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45518a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONVERSATION_THREAD = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION_THREAD

        /* renamed from: a, reason: collision with root package name */
        public final Class f45520a = o0.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45520a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONTACT_REQUEST_UNDER_18_WARNING = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONTACT_REQUEST_UNDER_18_WARNING

        /* renamed from: a, reason: collision with root package name */
        public final Class f45511a = lq0.e.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45511a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation CONVERSATION_SETTINGS = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.CONVERSATION_SETTINGS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45519a = v0.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45519a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };
    public static final ConversationFeatureLocation INBOX_MESSAGES_AND_CONTACTS = new ConversationFeatureLocation() { // from class: com.pinterest.feature.conversation.screen.ConversationFeatureLocation.INBOX_MESSAGES_AND_CONTACTS

        /* renamed from: a, reason: collision with root package name */
        public final Class f45521a = r1.class;

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getScreenClass, reason: from getter */
        public final Class getF45521a() {
            return this.f45521a;
        }

        @Override // com.pinterest.feature.conversation.screen.ConversationFeatureLocation, com.pinterest.framework.screens.ScreenLocation
        /* renamed from: getShouldShowMainNavigation */
        public final boolean getF46867b() {
            return false;
        }
    };

    private static final /* synthetic */ ConversationFeatureLocation[] $values() {
        return new ConversationFeatureLocation[]{CONVERSATION, CONVERSATION_CREATE, CONVERSATION_INBOX, CONTACT_REQUEST_INBOX, CONVERSATION_SEND_A_PIN_TAB_HOST, CONVERSATION_SEND_A_PIN_RELATED_PINS, CONVERSATION_SEND_A_PIN_USER_PINS, CONVERSATION_THREAD, CONTACT_REQUEST_UNDER_18_WARNING, CONVERSATION_SETTINGS, INBOX_MESSAGES_AND_CONTACTS};
    }

    static {
        ConversationFeatureLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.b0($values);
        Companion = new a();
        CREATOR = new b(4);
    }

    public /* synthetic */ ConversationFeatureLocation(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13);
    }

    @NotNull
    public static el2.a getEntries() {
        return $ENTRIES;
    }

    public static ConversationFeatureLocation valueOf(String str) {
        return (ConversationFeatureLocation) Enum.valueOf(ConversationFeatureLocation.class, str);
    }

    public static ConversationFeatureLocation[] values() {
        return (ConversationFeatureLocation[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    @NotNull
    /* renamed from: getDisplayMode */
    public g getF45517b() {
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
    public abstract /* synthetic */ Class getF45521a();

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldKeepOldScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45170b() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldNotActivateLastScreenVisible */
    public /* bridge */ /* synthetic */ boolean getF45172d() {
        return false;
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldShowMainNavigation */
    public /* bridge */ /* synthetic */ boolean getF46867b() {
        return super.getF46867b();
    }

    @Override // com.pinterest.framework.screens.ScreenLocation
    /* renamed from: getShouldSkipTransitions */
    public /* bridge */ /* synthetic */ boolean getF45171c() {
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

    private ConversationFeatureLocation(String str, int i13) {
    }
}
