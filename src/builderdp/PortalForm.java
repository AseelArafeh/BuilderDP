
package builderdp;


public class PortalForm extends javax.swing.JFrame {

    public PortalForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        educationPanel = new javax.swing.JPanel();
        majorLabel = new javax.swing.JLabel();
        schoolLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        degree = new javax.swing.JLabel();
        major = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        school = new javax.swing.JTextField();
        degreeLabel = new javax.swing.JTextField();
        addMoreEducation = new javax.swing.JButton();
        biographyPanel = new javax.swing.JPanel();
        licenseCountryLabel1 = new javax.swing.JLabel();
        licenseNumberLabel1 = new javax.swing.JLabel();
        genderLabel1 = new javax.swing.JLabel();
        yearsinPracticeLabel1 = new javax.swing.JLabel();
        licenseCountry1 = new javax.swing.JTextField();
        gender1 = new javax.swing.JTextField();
        licenseNumber1 = new javax.swing.JTextField();
        yearsinPractice1 = new javax.swing.JTextField();
        newDentistPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        emailAddressLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        websiteLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        emailAddress = new javax.swing.JTextField();
        website = new javax.swing.JTextField();
        addressPanel = new javax.swing.JPanel();
        cityLabel = new javax.swing.JLabel();
        postalCodeLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        postalCode = new javax.swing.JTextField();
        country = new javax.swing.JTextField();
        addMoreAddress = new javax.swing.JButton();
        specialityPanel = new javax.swing.JPanel();
        isSpecialistPanel = new javax.swing.JPanel();
        isSpecialist = new javax.swing.JCheckBox();
        yesItsSpecialistPanel = new javax.swing.JPanel();
        postalCodeLabel2 = new javax.swing.JLabel();
        areaOfSpecialization = new javax.swing.JTextField();
        startYearLabel = new javax.swing.JLabel();
        startYear = new javax.swing.JTextField();
        addMoreSpeciality = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        educationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Education"));

        majorLabel.setText("Major");

        schoolLabel.setText("School");

        yearLabel.setText("Year");

        degree.setText("Degree");

        major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majorActionPerformed(evt);
            }
        });

        addMoreEducation.setText("Add More");

        javax.swing.GroupLayout educationPanelLayout = new javax.swing.GroupLayout(educationPanel);
        educationPanel.setLayout(educationPanelLayout);
        educationPanelLayout.setHorizontalGroup(
            educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(educationPanelLayout.createSequentialGroup()
                        .addComponent(majorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationPanelLayout.createSequentialGroup()
                        .addComponent(degree, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(degreeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yearLabel)
                            .addComponent(schoolLabel))
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(educationPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(school, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(year)))
                            .addGroup(educationPanelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(addMoreEducation)))
                        .addGap(26, 26, 26))))
        );
        educationPanelLayout.setVerticalGroup(
            educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(educationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(educationPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(degree)
                            .addComponent(degreeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, educationPanelLayout.createSequentialGroup()
                        .addComponent(schoolLabel)
                        .addGap(69, 69, 69))
                    .addGroup(educationPanelLayout.createSequentialGroup()
                        .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(educationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(majorLabel)
                                .addComponent(major, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(school, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addMoreEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        biographyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Biography"));

        licenseCountryLabel1.setText("License Country");

        licenseNumberLabel1.setText("License Number");

        genderLabel1.setText("Gender");

        yearsinPracticeLabel1.setText("Years in Practice");

        licenseCountry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseCountry1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout biographyPanelLayout = new javax.swing.GroupLayout(biographyPanel);
        biographyPanel.setLayout(biographyPanelLayout);
        biographyPanelLayout.setHorizontalGroup(
            biographyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biographyPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(biographyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(biographyPanelLayout.createSequentialGroup()
                        .addComponent(licenseCountryLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(licenseCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(biographyPanelLayout.createSequentialGroup()
                        .addComponent(yearsinPracticeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yearsinPractice1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(biographyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(licenseNumberLabel1)
                    .addComponent(genderLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(biographyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenseNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        biographyPanelLayout.setVerticalGroup(
            biographyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(biographyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(biographyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseCountryLabel1)
                    .addComponent(licenseCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenseNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenseNumberLabel1))
                .addGap(13, 13, 13)
                .addGroup(biographyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel1)
                    .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearsinPracticeLabel1)
                    .addComponent(yearsinPractice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        newDentistPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("New Dentist"));

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        emailAddressLabel.setText("Email Address");

        phoneLabel.setText("Phone");

        websiteLabel.setText("Website");

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newDentistPanelLayout = new javax.swing.GroupLayout(newDentistPanel);
        newDentistPanel.setLayout(newDentistPanelLayout);
        newDentistPanelLayout.setHorizontalGroup(
            newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDentistPanelLayout.createSequentialGroup()
                .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newDentistPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newDentistPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(websiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailAddressLabel))))
                .addGap(18, 18, 18)
                .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newDentistPanelLayout.createSequentialGroup()
                        .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailAddress))
                        .addGap(98, 98, 98)
                        .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(phoneLabel))
                        .addGap(29, 29, 29)
                        .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastName, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(phone))
                        .addGap(20, 20, 20))
                    .addGroup(newDentistPanelLayout.createSequentialGroup()
                        .addComponent(website, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        newDentistPanelLayout.setVerticalGroup(
            newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newDentistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameLabel)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddressLabel)
                    .addComponent(phoneLabel)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newDentistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(websiteLabel)
                    .addComponent(website, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addressPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Address"));

        cityLabel.setText("City");

        postalCodeLabel.setText("Postal Code");

        stateLabel.setText("State");

        countryLabel.setText("Country");

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });

        addMoreAddress.setText("Add More");

        javax.swing.GroupLayout addressPanelLayout = new javax.swing.GroupLayout(addressPanel);
        addressPanel.setLayout(addressPanelLayout);
        addressPanelLayout.setHorizontalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addressPanelLayout.createSequentialGroup()
                        .addComponent(countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addressPanelLayout.createSequentialGroup()
                        .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(city)))
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addressPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addressPanelLayout.createSequentialGroup()
                                .addComponent(stateLabel)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addressPanelLayout.createSequentialGroup()
                                .addComponent(postalCodeLabel)
                                .addGap(18, 18, 18)))
                        .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(postalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(addressPanelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(addMoreAddress)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        addressPanelLayout.setVerticalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countryLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(country, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stateLabel)
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel)
                    .addComponent(postalCodeLabel)
                    .addComponent(postalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMoreAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        specialityPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Speciality"));

        isSpecialistPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        isSpecialist.setText("is Specialist");

        yesItsSpecialistPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        postalCodeLabel2.setText("Area of specialization");

        startYearLabel.setText("Start Year");

        addMoreSpeciality.setText("Add More");

        javax.swing.GroupLayout yesItsSpecialistPanelLayout = new javax.swing.GroupLayout(yesItsSpecialistPanel);
        yesItsSpecialistPanel.setLayout(yesItsSpecialistPanelLayout);
        yesItsSpecialistPanelLayout.setHorizontalGroup(
            yesItsSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yesItsSpecialistPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(yesItsSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(yesItsSpecialistPanelLayout.createSequentialGroup()
                        .addComponent(postalCodeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(areaOfSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yesItsSpecialistPanelLayout.createSequentialGroup()
                        .addComponent(startYearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(yesItsSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addMoreSpeciality)
                            .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        yesItsSpecialistPanelLayout.setVerticalGroup(
            yesItsSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yesItsSpecialistPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(yesItsSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeLabel2)
                    .addComponent(areaOfSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(yesItsSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startYearLabel)
                    .addComponent(startYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(addMoreSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout isSpecialistPanelLayout = new javax.swing.GroupLayout(isSpecialistPanel);
        isSpecialistPanel.setLayout(isSpecialistPanelLayout);
        isSpecialistPanelLayout.setHorizontalGroup(
            isSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isSpecialistPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(isSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yesItsSpecialistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isSpecialist))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        isSpecialistPanelLayout.setVerticalGroup(
            isSpecialistPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(isSpecialistPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isSpecialist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yesItsSpecialistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout specialityPanelLayout = new javax.swing.GroupLayout(specialityPanel);
        specialityPanel.setLayout(specialityPanelLayout);
        specialityPanelLayout.setHorizontalGroup(
            specialityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(specialityPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(isSpecialistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        specialityPanelLayout.setVerticalGroup(
            specialityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(specialityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isSpecialistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(biographyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newDentistPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(educationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(specialityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(newDentistPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(biographyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(educationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(specialityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void majorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_majorActionPerformed

    private void licenseCountry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseCountry1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseCountry1ActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PortalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PortalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMoreAddress;
    private javax.swing.JButton addMoreEducation;
    private javax.swing.JButton addMoreSpeciality;
    private javax.swing.JPanel addressPanel;
    private javax.swing.JTextField areaOfSpecialization;
    private javax.swing.JPanel biographyPanel;
    private javax.swing.JTextField city;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField country;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JLabel degree;
    private javax.swing.JTextField degreeLabel;
    private javax.swing.JPanel educationPanel;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField gender1;
    private javax.swing.JLabel genderLabel1;
    private javax.swing.JCheckBox isSpecialist;
    private javax.swing.JPanel isSpecialistPanel;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField licenseCountry1;
    private javax.swing.JLabel licenseCountryLabel1;
    private javax.swing.JTextField licenseNumber1;
    private javax.swing.JLabel licenseNumberLabel1;
    private javax.swing.JTextField major;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JPanel newDentistPanel;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField postalCode;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JLabel postalCodeLabel2;
    private javax.swing.JTextField school;
    private javax.swing.JLabel schoolLabel;
    private javax.swing.JPanel specialityPanel;
    private javax.swing.JTextField startYear;
    private javax.swing.JLabel startYearLabel;
    private javax.swing.JTextField state;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JTextField website;
    private javax.swing.JLabel websiteLabel;
    private javax.swing.JTextField year;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearsinPractice1;
    private javax.swing.JLabel yearsinPracticeLabel1;
    private javax.swing.JPanel yesItsSpecialistPanel;
    // End of variables declaration//GEN-END:variables
}
