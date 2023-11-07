package automatemod;

import basemod.BaseMod;
import basemod.ModLabel;
import basemod.ModPanel;
import basemod.interfaces.*;
import com.badlogic.gdx.graphics.Texture;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.rooms.AbstractRoom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

@SpireInitializer
public class AutomateMod implements PostInitializeSubscriber,
        EditCardsSubscriber, EditRelicsSubscriber, EditCharactersSubscriber,
        EditStringsSubscriber, SetUnlocksSubscriber, OnCardUseSubscriber,
        EditKeywordsSubscriber, OnPowersModifiedSubscriber, PostExhaustSubscriber,
        PostBattleSubscriber, PostDungeonInitializeSubscriber, PostDrawSubscriber {
    public static final Logger logger = LogManager.getLogger(AutomateMod.class.getName());
    // badge
    public static final String BADGE_IMG = "FRelicBadge.png";
    private static final String MODNAME = "AutomateMod";
    private static final String AUTHOR = "Jetsama";
    private static final String DESCRIPTION = "v1.0.0\n Adds The Seeker as a playable third character";
    private static final String FRUITY_MOD_ASSETS_FOLDER = "img";

    public AutomateMod() {
        BaseMod.subscribe(this);
    }

    /**
     * Makes a full path for a resource path
     *
     * @param resource the resource, must *NOT* have a leading "/"
     * @return the full path
     */
    private static final String makePath(String resource) {
        return FRUITY_MOD_ASSETS_FOLDER + "/" + resource;
    }

    public static void initialize() {
        logger.info("========================= AutomateMod INIT =========================");

        @SuppressWarnings("unused")
        AutomateMod fruit = new AutomateMod();

        logger.info("================================================================");
    }

    @Override
    public void receivePostInitialize() {
        // Mod badge
        Texture badgeTexture = new Texture(makePath(BADGE_IMG));
        ModPanel settingsPanel = new ModPanel();

        ModLabel label = new ModLabel("FruityMod does not have any settings (yet)!", 400.0f, 700.0f, settingsPanel, (me) -> {
        });
        settingsPanel.addUIElement(label);
        BaseMod.registerModBadge(badgeTexture, MODNAME, AUTHOR, DESCRIPTION, settingsPanel);

        Settings.isDailyRun = false;
        Settings.isTrial = false;
        Settings.isDemo = false;
    }

    @Override
    public void receiveEditCharacters() {
        logger.info("begin editting characters");


        logger.info("done editting characters");
    }


    @Override
    public void receiveEditRelics() {
        logger.info("begin editting relics");


        logger.info("done editting relics");
    }

    @Override
    public void receiveEditCards() {
        logger.info("begin editting cards");


        logger.info("done editting cards");
    }

    @Override
    public void receiveEditStrings() {
        logger.info("begin editting strings");


        logger.info("done editting strings");
    }

    @Override
    public void receiveSetUnlocks() {
    }


    @Override
    public void receiveEditKeywords() {
        logger.info("setting up custom keywords");
    }

    @Override
    public void receiveCardUsed(AbstractCard c) {
    }

    @Override
    public void receivePowersModified() {
    }

    @Override
    public void receivePostBattle(AbstractRoom arg0) {
    }

    @Override
    public void receivePostDungeonInitialize() {
    }

    @Override
    public void receivePostExhaust(AbstractCard c) {
    }

    @Override
    public void receivePostDraw(AbstractCard c) {
    }
}