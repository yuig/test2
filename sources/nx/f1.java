package nx;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.analytics.TrackingParamKeyBuilder;
import com.pinterest.anket.screen.AnketLocation;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.autoOrganize.screens.AutoOrganizeLocation;
import com.pinterest.boardAutoCollages.BoardAutoCollagesLocation;
import com.pinterest.boardShopTool.BoardShopToolLocation;
import com.pinterest.canvas.screen.CanvasLocation;
import com.pinterest.closeup.screens.PinFeatureLocation;
import com.pinterest.collage.composer.screens.CollageComposerLocation;
import com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation;
import com.pinterest.collage.cutoutpicker.screens.CollageCutoutPickerLocation;
import com.pinterest.collage.cutouttool.screens.CollageCutoutLocation;
import com.pinterest.collage.draftpicker.screens.CollageDraftPickerLocation;
import com.pinterest.collage.effects.screens.CollageEffectsLocation;
import com.pinterest.collage.remix.screens.CollageRemixLocation;
import com.pinterest.collage.retrieval.screens.CollageRetrievalLocation;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerOrigin;
import com.pinterest.creatorHub.feature.brandedContent.BrandedContentLocation;
import com.pinterest.creatorHub.feature.creatorpathways.CreatorPathwaysLocation;
import com.pinterest.creatorHub.feature.screen.CreatorHubHubLocation;
import com.pinterest.creatorHub.feature.screen.CreatorHubLocation;
import com.pinterest.feature.announcementmodal.location.AnnouncementModalFeatureLocation;
import com.pinterest.feature.board.BoardCreateOrPickerNavigation;
import com.pinterest.feature.board.BoardFeatureLocation;
import com.pinterest.feature.board.FavoritesFeatureLocation;
import com.pinterest.feature.board.create.BoardCreateFeatureLocation;
import com.pinterest.feature.board.detail.BoardDetailFeatureLocation;
import com.pinterest.feature.board.edit.BoardEditFeatureLocation;
import com.pinterest.feature.board.jumpstart.BoardJumpstartFeatureLocation;
import com.pinterest.feature.board.organize.BoardOrganizeFeatureLocation;
import h32.a4;
import h32.b4;
import h32.d4;
import h32.y3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92394a;

    public /* synthetic */ f1(int i13) {
        this.f92394a = i13;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel in3) {
        switch (this.f92394a) {
            case 0:
                Intrinsics.checkNotNullParameter(in3, "source");
                Intrinsics.checkNotNullParameter(in3, "in");
                TrackingParamKeyBuilder trackingParamKeyBuilder = new TrackingParamKeyBuilder();
                b4 b4Var = d4.Companion;
                int readInt = in3.readInt();
                b4Var.getClass();
                d4 a13 = b4.a(readInt);
                Intrinsics.f(a13);
                trackingParamKeyBuilder.f35481a = a13;
                int readInt2 = in3.readInt();
                if (readInt2 >= 0) {
                    a4.Companion.getClass();
                    trackingParamKeyBuilder.f35482b = y3.a(readInt2);
                }
                trackingParamKeyBuilder.f35483c = in3.readString();
                return trackingParamKeyBuilder;
            case 1:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString = in3.readString();
                    if (readString != null) {
                        return AnketLocation.valueOf(readString);
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            case 2:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString2 = in3.readString();
                    if (readString2 != null) {
                        return AutoOrganizeLocation.valueOf(readString2);
                    }
                    return null;
                } catch (Throwable unused2) {
                    return null;
                }
            case 3:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString3 = in3.readString();
                    if (readString3 != null) {
                        return BoardAutoCollagesLocation.valueOf(readString3);
                    }
                    return null;
                } catch (Throwable unused3) {
                    return null;
                }
            case 4:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString4 = in3.readString();
                    if (readString4 != null) {
                        return BoardShopToolLocation.valueOf(readString4);
                    }
                    return null;
                } catch (Throwable unused4) {
                    return null;
                }
            case 5:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString5 = in3.readString();
                    if (readString5 != null) {
                        return CanvasLocation.valueOf(readString5);
                    }
                    return null;
                } catch (Throwable unused5) {
                    return null;
                }
            case 6:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString6 = in3.readString();
                    if (readString6 != null) {
                        return PinFeatureLocation.valueOf(readString6);
                    }
                    return null;
                } catch (Throwable unused6) {
                    return null;
                }
            case 7:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString7 = in3.readString();
                    if (readString7 != null) {
                        return CollageComposerLocation.valueOf(readString7);
                    }
                    return null;
                } catch (Throwable unused7) {
                    return null;
                }
            case 8:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString8 = in3.readString();
                    if (readString8 != null) {
                        return CollageCutoutCloseupLocation.valueOf(readString8);
                    }
                    return null;
                } catch (Throwable unused8) {
                    return null;
                }
            case 9:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString9 = in3.readString();
                    if (readString9 != null) {
                        return CollageCutoutPickerLocation.valueOf(readString9);
                    }
                    return null;
                } catch (Throwable unused9) {
                    return null;
                }
            case 10:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString10 = in3.readString();
                    if (readString10 != null) {
                        return CollageCutoutLocation.valueOf(readString10);
                    }
                    return null;
                } catch (Throwable unused10) {
                    return null;
                }
            case 11:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString11 = in3.readString();
                    if (readString11 != null) {
                        return CollageDraftPickerLocation.valueOf(readString11);
                    }
                    return null;
                } catch (Throwable unused11) {
                    return null;
                }
            case 12:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString12 = in3.readString();
                    if (readString12 != null) {
                        return CollageEffectsLocation.valueOf(readString12);
                    }
                    return null;
                } catch (Throwable unused12) {
                    return null;
                }
            case 13:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString13 = in3.readString();
                    if (readString13 != null) {
                        return CollageRemixLocation.valueOf(readString13);
                    }
                    return null;
                } catch (Throwable unused13) {
                    return null;
                }
            case 14:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString14 = in3.readString();
                    if (readString14 != null) {
                        return CollageRetrievalLocation.valueOf(readString14);
                    }
                    return null;
                } catch (Throwable unused14) {
                    return null;
                }
            case 15:
                Intrinsics.checkNotNullParameter(in3, "parcel");
                za0.e eVar = CutoutPickerOrigin.Companion;
                int readInt3 = in3.readInt();
                eVar.getClass();
                return za0.e.a(readInt3);
            case 16:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString15 = in3.readString();
                    if (readString15 != null) {
                        return BrandedContentLocation.valueOf(readString15);
                    }
                    return null;
                } catch (Throwable unused15) {
                    return null;
                }
            case 17:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString16 = in3.readString();
                    if (readString16 != null) {
                        return CreatorPathwaysLocation.valueOf(readString16);
                    }
                    return null;
                } catch (Throwable unused16) {
                    return null;
                }
            case 18:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString17 = in3.readString();
                    if (readString17 != null) {
                        return CreatorHubHubLocation.valueOf(readString17);
                    }
                    return null;
                } catch (Throwable unused17) {
                    return null;
                }
            case 19:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString18 = in3.readString();
                    if (readString18 != null) {
                        return CreatorHubLocation.valueOf(readString18);
                    }
                    return null;
                } catch (Throwable unused18) {
                    return null;
                }
            case 20:
            default:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString19 = in3.readString();
                    if (readString19 != null) {
                        return BoardOrganizeFeatureLocation.valueOf(readString19);
                    }
                    return null;
                } catch (Throwable unused19) {
                    return null;
                }
            case 21:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString20 = in3.readString();
                    if (readString20 != null) {
                        return AnnouncementModalFeatureLocation.valueOf(readString20);
                    }
                    return null;
                } catch (Throwable unused20) {
                    return null;
                }
            case 22:
                BoardCreateOrPickerNavigation boardCreateOrPickerNavigation = new BoardCreateOrPickerNavigation();
                boardCreateOrPickerNavigation.f45087a = in3.createTypedArrayList(PinnableImage.CREATOR);
                boardCreateOrPickerNavigation.f45088b = in3.createStringArrayList();
                boardCreateOrPickerNavigation.f45089c = in3.readString();
                boardCreateOrPickerNavigation.f45091e = in3.readByte() != 0;
                boardCreateOrPickerNavigation.f45092f = in3.readString();
                boardCreateOrPickerNavigation.f45093g = in3.readByte() != 0;
                boardCreateOrPickerNavigation.f45094h = in3.readByte() != 0;
                boardCreateOrPickerNavigation.f45095i = in3.createStringArrayList();
                boardCreateOrPickerNavigation.f45096j = in3.readByte() != 0;
                return boardCreateOrPickerNavigation;
            case 23:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString21 = in3.readString();
                    if (readString21 != null) {
                        return BoardFeatureLocation.valueOf(readString21);
                    }
                    return null;
                } catch (Throwable unused21) {
                    return null;
                }
            case 24:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString22 = in3.readString();
                    if (readString22 != null) {
                        return FavoritesFeatureLocation.valueOf(readString22);
                    }
                    return null;
                } catch (Throwable unused22) {
                    return null;
                }
            case 25:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString23 = in3.readString();
                    if (readString23 != null) {
                        return BoardCreateFeatureLocation.valueOf(readString23);
                    }
                    return null;
                } catch (Throwable unused23) {
                    return null;
                }
            case 26:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString24 = in3.readString();
                    if (readString24 != null) {
                        return BoardDetailFeatureLocation.valueOf(readString24);
                    }
                    return null;
                } catch (Throwable unused24) {
                    return null;
                }
            case 27:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString25 = in3.readString();
                    if (readString25 != null) {
                        return BoardEditFeatureLocation.valueOf(readString25);
                    }
                    return null;
                } catch (Throwable unused25) {
                    return null;
                }
            case 28:
                if (in3 == null) {
                    return null;
                }
                try {
                    String readString26 = in3.readString();
                    if (readString26 != null) {
                        return BoardJumpstartFeatureLocation.valueOf(readString26);
                    }
                    return null;
                } catch (Throwable unused26) {
                    return null;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f92394a) {
            case 0:
                return new TrackingParamKeyBuilder[i13];
            case 1:
                return new AnketLocation[i13];
            case 2:
                return new AutoOrganizeLocation[i13];
            case 3:
                return new BoardAutoCollagesLocation[i13];
            case 4:
                return new BoardShopToolLocation[i13];
            case 5:
                return new CanvasLocation[i13];
            case 6:
                return new PinFeatureLocation[i13];
            case 7:
                return new CollageComposerLocation[i13];
            case 8:
                return new CollageCutoutCloseupLocation[i13];
            case 9:
                return new CollageCutoutPickerLocation[i13];
            case 10:
                return new CollageCutoutLocation[i13];
            case 11:
                return new CollageDraftPickerLocation[i13];
            case 12:
                return new CollageEffectsLocation[i13];
            case 13:
                return new CollageRemixLocation[i13];
            case 14:
                return new CollageRetrievalLocation[i13];
            case 15:
                return new CutoutPickerOrigin[i13];
            case 16:
                return new BrandedContentLocation[i13];
            case 17:
                return new CreatorPathwaysLocation[i13];
            case 18:
                return new CreatorHubHubLocation[i13];
            case 19:
                return new CreatorHubLocation[i13];
            case 20:
            default:
                return new BoardOrganizeFeatureLocation[i13];
            case 21:
                return new AnnouncementModalFeatureLocation[i13];
            case 22:
                return new BoardCreateOrPickerNavigation[i13];
            case 23:
                return new BoardFeatureLocation[i13];
            case 24:
                return new FavoritesFeatureLocation[i13];
            case 25:
                return new BoardCreateFeatureLocation[i13];
            case 26:
                return new BoardDetailFeatureLocation[i13];
            case 27:
                return new BoardEditFeatureLocation[i13];
            case 28:
                return new BoardJumpstartFeatureLocation[i13];
        }
    }
}
